package com.xycoding.clippicture;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class PreviewActivity extends Activity {
	ImageView preview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_preview);

		Bitmap bitmap = null;
		Intent in = getIntent();
		if (in != null) {
			byte[] bis = in.getByteArrayExtra("bitmap");
			bitmap = BitmapFactory.decodeByteArray(bis, 0, bis.length);
		}

		preview = (ImageView) this.findViewById(R.id.preview);
		if (bitmap != null) {
			preview.setImageBitmap(bitmap);
		}
	}

}
