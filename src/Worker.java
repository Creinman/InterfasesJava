import java.util.*;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i = 33) errorCallback.onError("error in 33").
            else
            callback.onDone("Task " + i + " is done");
        }
    }


}

@FunctionalInterface
public interface OnTaskErrorListener {
        void onError(String error);
}

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
