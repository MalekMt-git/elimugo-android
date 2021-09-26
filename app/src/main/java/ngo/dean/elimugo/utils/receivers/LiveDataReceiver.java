package ngo.dean.elimugo.utils.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import androidx.lifecycle.LiveData;

import java.util.function.BiFunction;

public class LiveDataReceiver<T> extends LiveData<T> {

    private final Context context;
    private final IntentFilter filter;
    private final BiFunction<Context, Intent, T> mapper;

    public LiveDataReceiver(Context context, IntentFilter filter, BiFunction<Context, Intent, T> mapper) {
        this.context = context;
        this.filter = filter;
        this.mapper = mapper;
    }

    @Override
    protected void onInactive() {
        super.onInactive();
        context.unregisterReceiver(receiver);
    }

    @Override
    protected void onActive() {
        super.onActive();
        context.registerReceiver(receiver, filter);
    }

    final BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            T value = mapper.apply(context, intent);
            if (value != null) {
                setValue(value);
            }
        }
    };
}
