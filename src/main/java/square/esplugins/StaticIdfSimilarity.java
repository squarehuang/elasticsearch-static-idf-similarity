package square.esplugins;

import org.apache.lucene.search.similarities.ClassicSimilarity;

/**
 * Created by squarehuang on 2017/2/2.
 */
public class StaticIdfSimilarity extends ClassicSimilarity {
    @Override
    public float idf(long docFreq, long numDocs) {
        return 1.0f;
    }
}
