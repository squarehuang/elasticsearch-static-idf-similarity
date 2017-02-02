package square.esplugins;

import org.elasticsearch.index.similarity.SimilarityModule;
import org.elasticsearch.plugins.Plugin;

/**
 * Created by squarehuang on 2017/2/2.
 */
public class StaticIdfSimilarityPlugin extends Plugin {

    @Override
    public String name() {
        return "static-idf-similarity-plugin";
    }

    @Override
    public String description() {
        return "Static Idf Similarity Plugin";
    }

    public void onModule(final SimilarityModule module) {
        module.addSimilarity("staticidfsimilarity", StaticIdfSimilarityProvider.class);
    }
}

