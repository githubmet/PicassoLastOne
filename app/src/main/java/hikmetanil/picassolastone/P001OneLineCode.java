package hikmetanil.picassolastone;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class P001OneLineCode extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String url="http://services.hanselandpetal.com/photos/aloe_vera.jpg";
        ImageView imageView=new ImageView(this);

        Picasso.get().load(url).into(imageView); //one line of code to get image from internet

        setContentView(imageView);
    }
}
