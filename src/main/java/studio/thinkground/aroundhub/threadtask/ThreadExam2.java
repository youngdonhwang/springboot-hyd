package studio.thinkground.aroundhub.threadtask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ThreadExam2 implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger(ThreadExam2.class);
    @Override
    public void run() {
        LOGGER.info("Called from thread");
    }
}