package au.id.chrisb.light;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rect_activity_main);
      //  final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
      //  stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
     //       @Override
     //       public void onLayoutInflated(WatchViewStub stub) {
     //           mTextView = (TextView) stub.findViewById(R.id.text);
      //      }
     //   });
        final TextView mainTitle = (TextView) findViewById(R.id.mainTitle);
        final Button upButton = (Button) findViewById(R.id.upButton);
        final Button downButton = (Button) findViewById(R.id.downButton);
        View.OnClickListener downListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                mainTitle.setText(count+"");
            }
        };
        View.OnClickListener upListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                mainTitle.setText(count+"");
            }
        };
        downButton.setOnClickListener(downListener);
        upButton.setOnClickListener(upListener);
        //mainTitle.setText("Pressed");
        //String msg = "pressed";
        //mainTitle.setText(msg);

    }
}
