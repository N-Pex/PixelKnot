package info.guardianproject.pixelknot;

import android.os.Environment;

public interface Constants {
	public final static String PASSWORD_SENTINEL = "----* PK v 1.0 REQUIRES PASSWORD ----*";
	public final static String PGP_SENTINEL = "-----BEGIN PGP MESSAGE-----";
	
	public final static byte[] DEFAULT_PASSWORD_SALT = new String("When I say \"make some\", you say \"noise\"!").getBytes();
	public final static byte[] DEFAULT_F5_SEED = new String("Make some [noise!]  Make some [noise!]").getBytes();
	public final static int PASSPHRASE_MIN_LENGTH = 4;
	
	public static class Logger {
		public final static String UI = "***************** PixelKnot **************";
		public final static String PREFS = "***************** PixelKnot (Prefs) **************";
		public static final String MODEL = "***************** PixelKnot (Model) **************";
		public static final String AES = "***************** PixelKnot (AES Util) **************";
		public static final String F5 = "***************** PixelKnot (F5) **************";
		public static final String LOADER =  "***************** PixelKnot (Loader Screen) **************";
		public static final String RPG = "***************** PixelKnot (Random Phrase Generator) **************";
	}
	
	public static class Settings {
		public static final String LANGUAGE = "pk_language";
		public static final class Locales {
			public final static int DEFAULT = 0;
			public final static int EN = 1;
			public final static int FA = 2;
			public final static int DE = 3;
			public final static int EL = 4;
			public final static int ES = 5;
			public final static int VI = 6;
		}
	}
	
	public final static String DUMP = Environment.getExternalStorageDirectory().getAbsolutePath() + "/PixelKnot";
	public static final String CURRENT_TAB = "currentTab";
	
	public static class Source {
		public static final int CAMERA = 1000;
		public static final int GALLERY = 1001;
		public static final String DECRYPT = "doDecryptOn";
		public static final int NOTIFICATION = 1002;
	}
	
	public static class Screens {
		public static class Loader {
			public static int[] KNOT_IMAGES = {
				R.drawable.knot_bow,
				R.drawable.knot_catspaw,
				R.drawable.knot_double_overhand,
				R.drawable.knot_fishermans_eye,
				R.drawable.knot_lariatloop,
				R.drawable.knot_overhand,
				R.drawable.knot_running,
				R.drawable.knot_sailors,
				R.drawable.knot_sheepshank,
				R.drawable.knot_stevedors,
				R.drawable.knot_surgeons
			};
			
			public static class Steps {
				public static final int EMBED = 12;
				public static final int EXTRACT = 12;
				public static final int DECRYPT = 6;
				public static final int ENCRYPT = 7;
			}
		}
	}
	
	public static class PixelKnot {
		public static class Modes {
			public static final int MODE_ENCRYPT = 1;
			public static final int MODE_DECRYPT = 2;
		}
		
		public static class Keys {
			public static final String COVER_IMAGE_NAME = "cover_image_name";
			public static final String COVER_IMAGE_URI = "cover_image_uri";
			public static final String SECRET_MESSAGE = "secret_message";
			public static final String PASSWORD = "password";
			public static final String CAN_SAVE = "can_save";
			public static final String HAS_ENCRYPTION = "has_encryption";
			public static final String CAPACITY = "capacity";
			public static final String OUT_FILE_NAME = "out_file_name";
			public static final String CUSTOM_SEED = "custom_seed";
			public static final String CURRENT_PROCESS = "current_process";
			public static final String CURRENT_PROCESS_TYPE = "current_process_type";
		}
		
		public static class ActivityNames {
			// package names from appbrain.com
			public static final String TWITTER = "Twitter";
			public static final String FACEBOOK = "Facebook";
			public static final String GMAIL = "GMail";
			public static final String BLUETOOTH = "Bluetooth";
			public static final String FLICKR = "Flickr";
			public static final String DROPBOX = "Dropbox";
			public static final String BUMP = "Bump";
			public static final String DRIVE = "Drive";
			public static final String GOOGLE_PLUS = "Google+";
			public static final String INSTAGRAM = "Instagram";
			public static final String TUMBLR = "Tumblr";
			public static final String WORDPRESS = "Wordpress";
			public static final String SKYPE = "Skype";
			public static final String EMAIL = "Email";
		}
	}
}
