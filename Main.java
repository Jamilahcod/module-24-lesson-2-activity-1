class hillstation{
    void location(){
        System.out.println("location is ");
    }
    void famousfor(){
        System.out.println("famous for ");
    }
}

class ilisu extends hillstation{
    void location() {
        System.out.println("location is Qax ");
    }

    void famousfor() {
        System.out.println("famous for mountins ");
    }


}

class Qabala extends hillstation {
    void location() {
        System.out.println("location is Azerbaijan");
    }

    void famousfor() {
        System.out.println("famous for hiking ");
    }

}

class Main{
    public static void main(String[] args) {
        hillstation h=new hillstation();
        h.location();
        h.famousfor();

        hillstation i=new ilisu();
        i.location();
        i.famousfor();

        hillstation Q=new Qabala();
        Q.location();
        Q.famousfor();
    }

}