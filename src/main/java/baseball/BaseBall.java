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
}
