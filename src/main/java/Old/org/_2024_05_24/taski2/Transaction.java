package Old.org._2024_05_24.taski2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
class Transaction {
    int id;
    double amount;
    String type;
}

