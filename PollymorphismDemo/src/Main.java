public class Main {

    public static void main(String[] args) {
       // BaseLogger[] loggers=new BaseLogger[]{new FileLogger(),new DatabseLogger(),new EmailLogger(),new ConsoleLogger()};
      //  for (BaseLogger logger:loggers){
      //      logger.Log("Log Mesajı");
      //  }

     CustomerManager customerManager=new CustomerManager(new DatabseLogger());
        customerManager.add();
    }
}
