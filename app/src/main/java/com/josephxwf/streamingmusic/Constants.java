package com.josephxwf.streamingmusic;


public class Constants {
    public interface ACTION {
        public static String MAIN_ACTION = "com.josephxwf.streamingmusic.action.main";
        public static String PREV_ACTION = "com.josephxwf.streamingmusic.action.prev";
        public static String PLAY_ACTION = "com.josephxwf.streamingmusic.action.play";
        public static String NEXT_ACTION = "com.josephxwf.streamingmusic.action.next";
        public static String STARTFOREGROUND_ACTION = "com.josephxwf.streamingmusic.action.startforeground";
        public static String STOPFOREGROUND_ACTION = "com.josephxwf.streamingmusic.action.stopforeground";
    }

    public interface NOTIFICATION_ID {
        public static int FOREGROUND_SERVICE = 101;
    }
}
