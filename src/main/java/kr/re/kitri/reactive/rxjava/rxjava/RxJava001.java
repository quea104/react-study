package kr.re.kitri.reactive.rxjava.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class RxJava001 {
    public static void main(String[] args) {
        // Publisher, Producer <= Data Source
        Observable<String> stringObservable =
                Observable.just("blue", "red", "pink");

        // Operator (filter, map ...)
        // Chaining(=Pipeline) 방식으로 데이터 처리
        Observable<String> stringObservable2 =
                stringObservable
                    .filter(d -> d.length() > 4)
                    .map(d -> d.toUpperCase());

        // Subscriber, Consumer
        // subscribe : Observer 을 상속받은 구현체
        stringObservable2.subscribe(d -> System.out.println(d));
    }
}
