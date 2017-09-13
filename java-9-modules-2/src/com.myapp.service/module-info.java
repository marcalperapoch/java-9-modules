module com.myapp.service {
    exports com.myapp.service;
    exports com.myapp.service.provider;
    requires java.logging;
    uses com.myapp.service.Repository;
    uses com.myapp.service.provider.RepositoryProvider;
}