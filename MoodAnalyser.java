import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyser {

	@Test
	public void moodAnalyser_Sad() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String mood = moodAnalyser.analyseMood("SAD MOOD");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void moodAnalyser_Happy() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("HAPPY MOOD");
        Assert.assertEquals("HAPPY",mood);
    }

	private String analyseMood(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
	