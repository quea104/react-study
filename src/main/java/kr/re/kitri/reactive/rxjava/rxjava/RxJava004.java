package kr.re.kitri.reactive.rxjava.rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class RxJava004 {
    // main thread
    public static void main(String[] args) throws InterruptedException {
        // time unit 만큼 데이터가 emit
        // observable은 별도의 thread 사용
        Observable<Long> interval =
            Observable.interval(500, TimeUnit.MILLISECONDS);
        interval.subscribe(d -> System.out.println(d));

        // observable thread가 실행되기 위해서는 main thread 을 잠재워야 함.
        Thread.sleep(5000);
    }
}
