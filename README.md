# CICD Lesson

This is a simple Spring Boot application with a CI/CD pipeline that deploys the application to a Digital Ocean droplet.

## How to make it live 

To make this application live, you need to follow these steps:

### 1. Set up your Digital Ocean droplet

1.  Create a new Digital Ocean droplet. You can use any operating system, but this guide assumes you are using Ubuntu.
2.  Make sure you have Java 17 and git installed on your droplet. You can install them by running the following commands:

    ```bash
    sudo apt-get update
    sudo apt-get install openjdk-17-jdk git
    ```

3.  Clone this repository to your droplet:

    ```bash
    git clone https://github.com/<your-username>/<your-repository>.git
    ```

4.  Make sure you have a directory to deploy the application to. The CI/CD pipeline assumes you have a directory at `/path/to/your/app`. You can create this directory by running the following command:

    ```bash
    mkdir -p /path/to/your/app
    ```

### 2. Configure your GitHub repository

1.  Go to your GitHub repository and click on the "Settings" tab.
2.  In the left sidebar, click on "Secrets and variables" and then "Actions".
3.  Click on the "New repository secret" button to add the following secrets:

    *   `DO_HOST`: The IP address of your Digital Ocean droplet.
    *   `DO_USERNAME`: The username to use to connect to your droplet.
    *   `DO_SSH_KEY`: The private SSH key to use to connect to your droplet.

### 3. Push your code

Once you have completed the steps above, you can push your code to the `master` branch of your GitHub repository. This will trigger the CI/CD pipeline, which will build and deploy the application to your Digital Ocean droplet.

After the pipeline has finished, you should be able to access your application by visiting `http://<your-droplet-ip>:8080` in your web browser.
