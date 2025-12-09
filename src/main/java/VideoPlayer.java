class VideoPlayer implements Player {
    public boolean onOff;
    public String video;
    public int currentTime;
    public int volume;

    public VideoPlayer(String video) {
        this.video = video;
        this.volume = 0;
        this.currentTime = 0;
        this.onOff = false;
    }

    public void start() {
        if (!this.onOff) {
            this.onOff = true;
        }
    }
    
    public void stop() {
        if (this.onOff) {
            this.onOff = false;
        }
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public void volumeUp() {
        this.volume += 5;
    }

    public void volumeDown() {
        this.volume -= 5;
    }

    public int getVolume() {
        return this.volume;
    }

        public void fastForward() {
        this.currentTime += 5;
    }

    public void rewind() {
        this.currentTime -= 5;
    }

    public int getCurrentTime() {
        return this.currentTime;
    }

    public String getVideo() {
        return this.video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}