package Phone;

public class Main {
    public static void main (String[] args){

        Phone iPhone = new Phone("+79801460768","14 Pro",206);
        Phone Samsung = new Phone("+375445788059","Galaxy S23",168);
        Phone Honor = new Phone("+375297689876","70",200);

        System.out.println("///");

        iPhone.infoPhone();
        Samsung.infoPhone();
        Honor.infoPhone();

        System.out.println("///");

        iPhone.receiveCall("Vera");
        Samsung.receiveCall("Lesha");
        Honor.receiveCall("Alena");

        System.out.println("///");

        iPhone.getNumber();
        Samsung.getNumber();
        Honor.getNumber();

        iPhone.receiveCall("Vera","+79801460768");
        Samsung.receiveCall("Lesha","+375445788059");
        Honor.receiveCall("Alena","+375297689876");

        System.out.println("///");

        iPhone.sendMessage("+37544657876","+3753365478698");
        Samsung.sendMessage("+7987567654");
        Honor.sendMessage("+7896440987");

    }
}
