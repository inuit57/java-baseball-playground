package baseball;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Data
public class BaseBall {
    List<BNumber> bNumbers = new ArrayList<>();

    public void generateNumbers(int limits){
        AtomicInteger index = new AtomicInteger();
        bNumbers = new Random().ints(1, 10)
                .distinct()
                .limit(limits)
                .boxed()
                .map(num -> new BNumber(index.getAndIncrement(), num))
                .collect(Collectors.toList());
    }

    public boolean checkBall(int number){
        return bNumbers.get(0).checkBall(number) ||
                bNumbers.get(1).checkBall(number) ||
                bNumbers.get(2).checkBall(number);
    }

    public String calculate(BaseBall bsb){

        int ball = 0 ;
        int strike = 0;

        int out = 0 ;

        for (int i =0 ; i < 3 ; i++){
            BNumber bNumber = this.bNumbers.get(i);
            BNumber bsbNumber = bsb.bNumbers.get(i);

            if( bNumber.equals(bsbNumber)){
                strike++;
            }else if( this.checkBall(bsbNumber.getNumber())){
                ball ++;
            }else{
                out ++;
            }
        }

        if( out >= 3) return "OUT";
        else {
            return strike + "S" + ball + "B";
        }
    }
}
