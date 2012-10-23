package com.paresh.edittextseterror;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * 
 * @author Paresh N. Mayani
 * Purpose: Demo to show the purpose of setError() method in EditText view.
 *
 */
public class MainActivity extends Activity {
    /** Called when the activity is first created. */
	
	EditText editText;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        editText = (EditText) findViewById(R.id.editText1);        
    }
    
    public void btnClick(View v)
    {
    	if(editText.getText().length()==0)
    	{
        	editText.setError("please input text");
    	}
    }
}