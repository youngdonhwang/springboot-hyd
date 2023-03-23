package studio.thinkground.aroundhub.threadtask;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ThreadAsyncExam1 {

    @Async
    public void doSomethingAsync() {
        // Perform time-consuming task here
        System.out.println("Task executed asynchronously on thread: " + Thread.currentThread().getName());
    }

}
