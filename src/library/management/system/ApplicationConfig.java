package library.management.system;

public class ApplicationConfig {
    
    public AppContext createAppContext() {
        ConsoleIO io = ConsoleIO.getInstance();
        UserFactory userFactory = new UserFactory();
        RepositoryFactory repositoryFactory = createRepositoryFactory(userFactory);
        
        UserRepository userRepo = repositoryFactory.createUserRepository();
        BookRepository bookRepo = repositoryFactory.createBookRepository();
        OrderRepository orderRepo = repositoryFactory.createOrderRepository();
        BorrowingRepository borrowingRepo = repositoryFactory.createBorrowingRepository();
        
        UserService userService = new UserService(userRepo);
        BookService bookService = new BookService(bookRepo);
        OrderService orderService = new OrderService(orderRepo);
        BorrowingService borrowingService = new BorrowingService(borrowingRepo, bookService);
        DataService dataService = new DataService(userRepo, bookRepo, orderRepo, borrowingRepo);
        
        return new AppContext(userService, bookService, orderService, borrowingService, dataService, io);
    }
    
    /**
     * Override this method in a subclass to use a different storage type
     * (e.g., DatabaseRepositoryFactory instead of FileRepositoryFactory)
     */
    protected RepositoryFactory createRepositoryFactory(UserFactory userFactory) {
        return new FileRepositoryFactory(userFactory);
    }
}