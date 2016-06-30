package per.alex.testHello;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class HelloActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
//		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.helloworld);
		
		Button btn1 = (Button)findViewById(R.id.button1);
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(HelloActivity.this, "I'm a toast..", Toast.LENGTH_SHORT).show();
//				finish();
			}
		});
	}
	
	//这一步实现按menu键显示出menu选项,eg:Add, Remove
	public boolean onCreateOptionsMenu(Menu myMenu){
		getMenuInflater().inflate(R.menu.main, myMenu);
		return true;
	}
	
	//实现点击menu选项中的相应处理
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
		case R.id.add_item:
			Toast.makeText(this, "Add this activity", Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(this, "Remove this activity", Toast.LENGTH_SHORT).show();
			break;
		default:
		}
		return true;
	}
}
