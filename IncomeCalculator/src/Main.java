import java.util.Scanner;

public class Main
{
    // Присваиваются значения переменным
    private static int minIncome = 200000;
    private static int maxIncome = 900000;

    private static int officeRentCharge = 140000;
    private static int telephonyCharge = 12000;
    private static int internetAccessCharge = 7200;

    private static int assistantSalary = 45000;
    private static int financeManagerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15;

    private static double minInvestmentsAmount = 100000;

    public static void main(String[] args)
    {
        double minIncome = (minInvestmentsAmount/(1-mainTaxPercent) + calculateFixedCharges()) / (1 - managerPercent);
        System.out.println("Минимальная выручка - " + minIncome);


        while(true) //Запускается цикл для определения возможности.
        {
            System.out.println("Введите сумму доходов компании за месяц " + //В консоль выводится предложение указать сумму выручки
                "(от 200 до 900 тысяч рублей): ");
            int income = (new Scanner(System.in)).nextInt(); // Считывается введенная цифра

            if(!checkIncomeRange(income)) { //Проверяется соответствие введенной суммы установленному коридору
                continue; //если размер выручки не соответствует границам, предлагается следующая попытка
            }

            double managerSalary = income * managerPercent; //определяется вознаграждение мнеджера
            double pureIncome = income - managerSalary - //определяется выручка за вычетом вознаграждения менеджера и расходов на офис
                calculateFixedCharges();
            double taxAmount = mainTaxPercent * pureIncome; //определяется размер налогов
            double pureIncomeAfterTax = pureIncome - taxAmount; //определяется выручка после вычета рсходов и уплаты налогов

            boolean canMakeInvestments = pureIncomeAfterTax >=  // если выручка после вычета рсходов и уплаты налогов больше минимальной суммы
                                                                // инвестиционного счета, переменной canMakeInvestments присваивается значение true
                minInvestmentsAmount;

            System.out.println("Зарплата менеджера: " + managerSalary); //печатается размер вознаграждения менеджера
            System.out.println("Общая сумма налогов: " +                //печатается размер налогов, если он больше 0
                (taxAmount > 0 ? taxAmount : 0));
            System.out.println("Компания может инвестировать: " +       //выводится сообщение о возможности инвестициий, если прибыль
                (canMakeInvestments ? "да" : "нет"));                   // больше минимальной суммы инвест счета
            if(pureIncome < 0) {                                        //если прибыль меньше 0, печатается соответствующее сообщение
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }

    private static boolean checkIncomeRange(int income) //метод для проверки соответствия суммы установленному коридору
    {
        if(income < minIncome) //если выручка меньше нижней границы, печатается соответсвующее сообщение
        {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if(income > maxIncome) //если выручка больше верхней границы, печатается соответсвующее сообщение
        {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true; //если выручка соответствует границам коридора, продолжается выполнение цикла
    }

    private static int calculateFixedCharges() //метод считает сумму расходов на офис
    {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}
