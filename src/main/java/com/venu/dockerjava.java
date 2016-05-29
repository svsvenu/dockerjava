package com.venu;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DockerClientBuilder;

/**
 * Created by venusurampudi on 5/28/16.
 */
public class dockerjava {

    //nb1

    public static void main(String args[]) {

        DockerClient dockerClient = DockerClientBuilder.getInstance("http://localhost:2375").build();



    }


}
