import java.util.Scanner;

public class Homework {
    // Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
    // Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать 
    // перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
    // В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
    // Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
        public static void main(String[] args) throws Exception {
           
             


            HotDrinkMachine m = new HotDrinkMachine();
            System.out.println("Все напитки в Автомате");
            m.addProduct(new HotDrink("Hote chocolate", 110, 70, 0.5));
            m.addProduct(new HotDrink("dobale Hote chocolate", 110, 70, 0.3));
            m.addProduct(new HotDrink("Cappucino", 200, 60, 0.5));
            m.addProduct(new HotDrink("Latte", 150, 80, 0.3));
            m.addProduct(new HotDrink("Latte With milk", 150, 80, 0.5));
            m.addProduct(new HotDrink("Americano", 350, 60, 0.3));
            for (Product product : HotDrinkMachine.products) {
                System.out.println(product);
                
            
            }
                StarMenu();
            }

            
            

            private static void printMenu(){

                System.out.println("Выберете по какому параметру осуществить поиск напитка");
                System.out.println("1:По названию напитка");
                System.out.println("2:По температуре напитка");
                System.out.println("3:По обьему напитка ");
                System.out.println("4:Exit");
                
             
        }
            
            private static void StarMenu() {
                
                Scanner scanner = new Scanner(System.in);
                HotDrinkMachine m = new HotDrinkMachine();
                
                if (scanner != null) {
                    int key;
                    do {
                        printMenu();
                        System.out.print("Введите номер меню: ");
                        key = scanner.nextInt();
                        switch (key) {
                            case 1:nameFind();
                                break;
                            case 2:temperatureFind();
                                break;
                            case 3:newVolme();
                                break;
                            case 4:
                                System.out.println("Завершение программы...");
                                break;
                            default:
                                System.out.println("Вы ввели неверное значение меню...\n");
                        }
                    } while (key != 4);
                }
            
        }

        private static  void nameFind(){

        HotDrinkMachine m = new HotDrinkMachine(); 
        Scanner scanner = new Scanner(System.in);
        String names;  
        System.out.println("Введите Название напитка");
        names = scanner.next(); 
        System.out.println(m.getProduct(names));

        }
        
        private static void temperatureFind(){
            HotDrinkMachine m = new HotDrinkMachine(); 
            Scanner scanner = new Scanner(System.in);
            int newTemperature;
            System.out.println("Введите температуру напитка"); 
            newTemperature = scanner.nextInt();
            System.out.println(m.getProduct(newTemperature));
            }
            

        private static void newVolme(){
            HotDrinkMachine m = new HotDrinkMachine(); 
            Scanner scanner = new Scanner(System.in);
            double newVolme;
            System.out.println("Введите объем напитка");
            newVolme = scanner.nextDouble();
            System.out.println(m.getProduct(newVolme));
        }    

        }

        
 
            

        

        

