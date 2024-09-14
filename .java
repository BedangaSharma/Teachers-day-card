// Function to handle the name submission and start animation
function startAnimation() {
    const teacherNameInput = document.getElementById("teacherNameInput").value;
    
    if (teacherNameInput) {
        // Replace placeholder with actual teacher name
        document.getElementById("teacherName").innerText = teacherNameInput;
        
        // Hide the name entry section
        document.getElementById("nameEntrySection").style.display = "none";
        
        // Show the mailbox section
        document.getElementById("mailbox").style.display = "block";
    }
}

// Function to open the card and display the message
function openCard() {
    // Hide the mailbox section
    document.getElementById("mailbox").style.display = "none";
    
    // Show the glitter effect and card with message
    document.getElementById("glitterEffect").style.display = "block";
    document.getElementById("messageCard").style.display = "block";
}
