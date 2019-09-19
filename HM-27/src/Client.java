public class Client {

    public  static int account = 15000;

    Client(){
    }

    public void pay(int money){ //оплатить Заказ
        account-=money;
    }

    public  void payment( int money){//платеж
        account+=money;
    }

    @Override
    public String toString() {
        return "Client account = " + Client.account;
    }
}
