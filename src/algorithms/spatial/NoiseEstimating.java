/*
 * Copyright (C) 2016 Jean-Jacques Ponciano.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package algorithms.spatial;

import algorithms.IAlgorithm;
import org.hibernate.cfg.NotYetImplementedException;
import pointcloud.PointCloud;

/**
 * Estimate the noise in a point cloud.
 *
 * @author Jean-Jacques Ponciano
 */
public class NoiseEstimating implements IAlgorithm {

    protected PointCloud cloud;
    protected boolean isReady;
     protected Unit unit;

    public NoiseEstimating(PointCloud cloud, Unit unit) {
        this.cloud = cloud;
        this.unit = unit;
        this.isReady=true;
    }
     

    @Override
    public boolean isReady() {
        return isReady;
    }

    @Override
    public void run() {
        //get the density of the cloud
        PointDensity densityPC=new PointDensity(cloud, unit);
        densityPC.run();
        double density = densityPC.getDensity();
        //distance min
        double min=1.0/density;
        double noise=0;
        throw new NotYetImplementedException("Not yet implemented.");
        //look for each point if it has a other point close to this point.
        
    }

}
