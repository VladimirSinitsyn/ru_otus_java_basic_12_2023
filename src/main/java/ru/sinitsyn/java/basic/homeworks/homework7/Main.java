package ru.sinitsyn.java.basic.homeworks.homework7;
/*v● Создайте класс Человек с полями name(имя)и currentTransport(текущий транспорт)
  v● Реализуйте в вашем приложении классы Машина,Лошадь,Велосипед,Вездеход
  ● Каждый из классов должен предоставлять возможность перемещаться на определенное расстояние с указанием типа местности
  v● В приложении должны быть типы местности:густой лес,равнина,болото
  ● Человек должен иметь возможность сесть на любой из этих видов транспорта,встать с него,
    или переместиться на некоторое расстояние(при условии что он находится на каком-либо транспорте)
  ● При попытке выполнить перемещение у человека,не использующего транспорт,считаем что он просто идет указанное расстояние пешком
  ● При перемещении Машина и Вездеход тратят бензин,который у них ограничен.Лошадь тратит силы.
    Велосипед может использоваться без ограничений(можете для усложнения велосипедом тратить силы “водителя”).
    При выполнении действия результат должен быть отпечатан в консоль
  ● У каждого вида транспорта есть местности по которым он не может перемещаться:
    машина-густой лес и болото,лошадь и велосипед-болото,вездеход-нет ограничений
  ● При попытке переместиться должен быть возвращен результат true/false-удалось ли выполнить действие*/

public class Main {

    Car car = new Car("Ggoolee", 100);
    //Human man = new Human("Коля")
    static Human man = new Human("Vlad Rakin");

    public static void main(String[] args) {

    }
}