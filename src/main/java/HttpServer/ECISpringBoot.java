package HttpServer;

public class ECISpringBoot {
    private static ECISpringBoot _instance = new ECISpringBoot();
    private ECISpringBoot(){}

    public ECISpringBoot getInstance(){
        return _instance;
    }

    public void startSever(){
        HttpServer httpServer = new HttpServer();
        httpServer.start();

    }
}
