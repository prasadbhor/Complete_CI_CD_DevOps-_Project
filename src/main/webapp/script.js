function connectBackend() {
    fetch("/gym")
        .then(response => response.text())
        .then(data => {
            document.getElementById("result").innerText = data;
        })
        .catch(error => {
            document.getElementById("result").innerText = "Error connecting backend";
        });
}
