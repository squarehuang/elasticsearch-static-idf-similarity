package square.esplugins;

import org.apache.lucene.search.similarities.Similarity;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.similarity.AbstractSimilarityProvider;

/**
 * Created by squarehuang on 2017/2/2.
 */
public class StaticIdfSimilarityProvider extends AbstractSimilarityProvider {

    private StaticIdfSimilarity similarity;

    @Inject
    public StaticIdfSimilarityProvider(@Assisted String name, @Assisted Settings settings) {
        super(name);
        this.similarity = new StaticIdfSimilarity();
    }

    @Override
    public Similarity get() {
        return similarity;
    }

}
