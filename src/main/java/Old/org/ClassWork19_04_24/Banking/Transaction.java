package Old.org.ClassWork19_04_24.Banking;



import java.time.LocalDate;
import java.util.Objects;

/**
 * Напишите программу,
 * которая учитывает все финансовые транзакции пользователя за месяц.
 * Пользователь вводит суммы каждой транзакции, и они добавляются в список.
 * Программа должна выводить общую сумму расходов и доходов за указанный месяц,
 * а также баланс. Суммы операций нужно хранить, используя списки List<Double> или List<BigDecimal>.
 */
public final class Transaction {
    private final double sum;
    private final LocalDate date;

    /**
     *
     */
    public Transaction(double sum, LocalDate date) {
        this.sum = sum;
        this.date = date;
    }

    public double sum() {
        return sum;
    }

    public LocalDate date() {
        return date;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Transaction) obj;
        return Double.doubleToLongBits(this.sum) == Double.doubleToLongBits(that.sum) &&
                Objects.equals(this.date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sum, date);
    }

    @Override
    public String toString() {
        return "Transaction[" +
                "sum=" + sum + ", " +
                "date=" + date + ']';
    }


}
