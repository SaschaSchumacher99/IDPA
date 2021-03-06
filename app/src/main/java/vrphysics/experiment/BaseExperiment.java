package vrphysics.experiment;

import processing.core.PApplet;
import vrphysics.MainActivity;
import vrphysics.controls.SimulationControls;
import processing.core.PApplet;

public abstract class BaseExperiment extends PApplet implements ExperimentMetaData, SimulationControls {
    public final void exit() {
        ((MainActivity) this.getActivity()).returnToMenu();
    }
}
