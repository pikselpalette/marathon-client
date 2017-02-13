package mesosphere.marathon.client.model.v2;

import mesosphere.marathon.client.utils.ModelUtils;

public class UpgradeStrategy {
    private Double maximumOverCapacity;
    private Double minimumHealthCapacity;

    public Double getMaximumOverCapacity() {
        return maximumOverCapacity;
    }

    public void setMaximumOverCapacity(Double maximumOverCapacity) {
        this.maximumOverCapacity = maximumOverCapacity;
    }

    public Double getMinimumHealthCapacity() {
        return minimumHealthCapacity;
    }

    public void setMinimumHealthCapacity(Double minimumHealthCapacity) {
        this.minimumHealthCapacity = minimumHealthCapacity;
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
