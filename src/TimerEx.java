 import java.util.Timer;
import java.util.TimerTask;

class TimerEx {
    public static void main(String arglist[]) {
    Timer timer;
    timer = new Timer();
    final String str = new String("Han transcurrido 10 TICS");

    TimerTask task = new TimerTask() {
        int tic = 0;

        @Override
        public void run()
        {
            if (tic%2==0)
            System.out.println("TIC");
            else
            System.out.println("TOC");
            tic++;
            if (tic%10==0)
            {
                System.out.println(str);
            }
        }
        };

    timer.schedule(task, 0, 1000);
    }
}
