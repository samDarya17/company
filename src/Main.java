import Company.*;

public class Main {
    public static void main(String[] args) {
//        VowelConstantIf VoCoIf = new VowelConstantIf();
//        VoCoIf.VowelConstantIf();
//
//        VowelConstantSwitch VoCoSw = new VowelConstantSwitch();
//        VoCoSw.VowelConstantSwitch();
//
//        SeasonMonth SeMo = new SeasonMonth();
//        SeMo.SeasonMonth();
//
//        Exit Ex = new Exit();
//        Ex.Exit();
//
//        SumNumbers SuNum = new SumNumbers();
//        SuNum.SumNumbers();
//
//
//
//        FibonacciArray fibonacciArray = new FibonacciArray();
//        fibonacciArray.fib(7);
//
//        MinMaxSum minMaxSum = new MinMaxSum();
//        minMaxSum.MinMaxSum();
//
//        SumEvenOddDiff SuEvOdDiff = new SumEvenOddDiff();
//        SuEvOdDiff.SumEvenOddDiff();
//
//
//
//        CheckSeason checkSeason = new CheckSeason();
//        checkSeason.checkSeason(MONTH.SEPTEMBER);
//
//        SameClass sameClass1 = new homeWork3.twoClassesOne.SameClass();
//        sameClass1.say();
//        SameClass sameClass2 = new homeWork3.twoClassesTwo.SameClass();
//        sameClass2.say();
//
//        MyClassDeprecated myClassDeprecated = new MyClassDeprecated();
//        myClassDeprecated.oldMethod();
//
//        OverloadExample example = new OverloadExample();
//        System.out.println(example.sum(1, 2));
//        System.out.println(example.sum(1.5, 2.5));
//        System.out.println(example.sum("Hello, ", "world!"));
//
//        MyClassDeprecated example = new MyClassDeprecated();
//        System.out.println(example.sum(1, 2));
//        System.out.println(example.sum(1.5, 2.5));
//        System.out.println(example.sum("Hello, ", "world!"));
//
//        int[]arr = {2,3,34,-132,31,54};
//        ArraysMethod arraysMethod = new ArraysMethod();
//        arraysMethod.printSortArray(arr);
//        arraysMethod.printMaxValue(arr);
//        arraysMethod.printElement(arr,4);
//
//        USER user = USER.USER3;
//        user.printUserInfo();
//        user.upAge(2);
//        user.setLastName("IVANOVA");
//        user.printUserInfo();
//
//
        Employee worker1 = new Worker("Андрей","Иванов",1);
        Employee worker2 = new Worker("Алексей","Петров",2);
        Employee worker3 = new Worker("Дмитрий","Сидоров",3);
        Employee worker4 = new Worker("Ольга","Антонова",4);
        Employee intern1 = new Intern("Оксана","Фролова",1);
        Employee janitor1 = new Janitor("Антон","Давыдов",2);

        Director director1 = new Director("Сергей","Дмитриев",1);
        Director director2= new Director("Анна","Васильева",2);


        director1.addWorker(worker1);
        director1.addWorker(worker2);
        director1.addWorker(worker3);

        director2.addWorker(worker4);

        director1.addWorker(director2);

        worker1.addWorker(director2);
        System.out.println(worker1);
        System.out.println(janitor1.getSalary());


    }
}
