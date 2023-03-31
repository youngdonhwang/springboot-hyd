package studio.thinkground.aroundhub.threadtask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

@Service
public class AsynchronousService {
    @Autowired
    private TaskExecutor taskExecutor;
    @Autowired
    private ApplicationContext applicationContext;
    public void executeAsynchronously() {
        ThreadExam2 myThread = applicationContext.getBean(ThreadExam2.class);
        taskExecutor.execute(myThread);
    }
}