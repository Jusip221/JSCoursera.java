function upDate(previewPic) {
    // Log event trigger
    console.log("Mouse over image detected!");

    // Log previewPic properties
    console.log("Image source:", previewPic.src);
    console.log("Image alt text:", previewPic.alt);

    // Select the div with id 'image' and update content
    let displayDiv = document.getElementById("image");
    displayDiv.innerHTML = previewPic.alt;

    // Update background image
    displayDiv.style.backgroundImage = `url('${previewPic.src}')`;
}

function unDo() {
    // Log event trigger
    console.log("Mouse left image!");

    // Reset the div with id 'image' to its original state
    let displayDiv = document.getElementById("image");
    displayDiv.innerHTML = "Hover over an image below to display here.";
    displayDiv.style.backgroundImage = "url('')";
}
