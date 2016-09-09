/**
 * User: Pavel Pozdeev, Texuna Technologies
 * Date: 9/9/2016
 */
public interface BaseModelInterface {
    void initialize();
    void on();
    void off();
    void setBpm(int bpm);
    int getBpm();

    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);
    void notifyObserver(BPMObserver o);
}
