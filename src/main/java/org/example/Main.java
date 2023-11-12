package org.example;

public class Main {
    public static void defaultToys(Store store){
        store.creatToy("Конструктор", 3);
        store.creatToy("Кукла", 4);
        store.creatToy("Пазл", 7);
        store.creatToy("Машина", 5);
        System.out.println("Список заполнен.");
    }
    public static void main(String[] args) {


        Store store = new Store ();
        Raffle raffle = new Raffle();

        String menu;
        while(true){
            System.out.println("1 - провести розыгрышь\n" +
                    "2 - список игрушек\n" +
                    "3 - добавить игрушку в розыгрышь\n" +
                    "4 - редактировать\n" +
                    "5 - удалить\n" +
                    "0 - Заполнить список игрушек по умолчанию\n" +
                    "6 - выход\n");
            menu = View.inputStr("Введите действие: ");
            if(menu.equals("6")) break;
            else{
                switch(menu){
                    case("0"):
                        Main.defaultToys(store);
                        break;
                    case("1"):
                        if(store.fullStore()) store.getPrize(raffle.getRandomPrize(store));
                        else System.out.println("Нет игрушек.");
                        break;
                    case("2"):
                        store.print();
                        break;
                    case("3"):
                        store.creatToy(View.inputStr("Введите название игрушки: "), View.inputNum("Введите количество ишрушек: "));
                        break;
                    case("4"):
                        store.editToy(View.inputNum("Введите id: "));
                        break;
                    case("5"):
                        store.removeToy(View.inputNum("Введите id: "));
                        break;
                }
            }
        }
    }
}