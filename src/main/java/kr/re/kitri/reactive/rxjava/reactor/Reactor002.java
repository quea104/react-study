package kr.re.kitri.reactive.rxjava.reactor;

import reactor.core.publisher.Flux;

import java.util.function.Consumer;

public class Reactor002 {
    public static void main(String[] args) {
        // 1. Flux 생성 - range() 사용
        Flux<Integer> integerFlux = Flux.range(2020, 10);

        // 2. 데이터 연산 - filter, map
        Flux<String> stringFlux = integerFlux
                .filter(i -> i % 2 == 0) // filter - 짝수 연도 필터링
                .map(i -> i + "년"); // map - '2020년' 반환

        // 3. 데이터 사용 - 콘솔 출력
        //stringFlux.subscribe(new MyConsumer());
        stringFlux.subscribe(s -> System.out.println(s));
    }
}

class MyConsumer implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
