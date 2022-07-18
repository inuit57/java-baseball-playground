package baseball;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BNumber {
    int index;
    int number;


    public boolean checkBall(int number) {
        return this.number == number;
    }


}
