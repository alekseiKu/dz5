import ru.netology.services.CalcMonthService;

public class Main {

    public static void main(String[] args) {
        CalcMonthService service = new CalcMonthService();
        int count = service.calculate(10000, 3000, 20000);
        System.out.println("Количество месяцев отдыха:" + count);
    }
}
