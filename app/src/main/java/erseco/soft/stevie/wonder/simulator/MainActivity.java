package erseco.soft.stevie.wonder.simulator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    private boolean rayCharlesModeEnabled = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = this;
        final GestureDetector.SimpleOnGestureListener listener = new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onDoubleTap(MotionEvent e) {

                if (rayCharlesModeEnabled) {
                    rayCharlesModeEnabled = false;
                    Toast.makeText(context, "Ray Charles mode Disabled", Toast.LENGTH_SHORT).show();
                } else {
                    rayCharlesModeEnabled = true;
                    Toast.makeText(context, "Ray Charles mode Enabled", Toast.LENGTH_SHORT).show();
                }
                return true;
            }

            @Override
            public void onLongPress(MotionEvent e) {
                if (rayCharlesModeEnabled) {
                    rayCharlesModeEnabled = false;
                    Toast.makeText(context, "Ray Charles mode Disabled", Toast.LENGTH_SHORT).show();
                } else {
                    rayCharlesModeEnabled = true;
                    Toast.makeText(context, "Ray Charles mode Enabled", Toast.LENGTH_SHORT).show();
                }
            }
        };

        final GestureDetector detector = new GestureDetector(listener);

        detector.setOnDoubleTapListener(listener);
        detector.setIsLongpressEnabled(true);

        getWindow().getDecorView().setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                return detector.onTouchEvent(event);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item)
    {
    	// TODO Apndice de mtodo generado automticamente
    	
    	System.exit(0);
    	
    	
    	return super.onMenuItemSelected(featureId, item);
    }

}
