// // Image Slider Logic
// let images = document.querySelectorAll('.image-slider img');
// let index = 0;
// //document.querySelectorAll('.image-slider img') finds all <img> elements inside an element with the class .image-slider.
// //querySelectorAll() returns a NodeList (which is similar to an array).
//
// //🔹 let index = 0; means:
// //✔ Start at the first image (position 0).
// //✔ Keep track of which image is currently being displayed.
//
//
// // function flipImages() {
// //     //function flipImages:automatically switches images,making one visible at a time.
// //     images.forEach(img => img.classList.remove('active'));
// //     //images.forEach(...) → Go through each image one by one.
// //     //removes the "active" class from each image, so when we move to another image previous one will not be visible.
// //     images[index].classList.add('active');
// //     //1️⃣ images[index] → Selects the current image from the list.
// //     //2️⃣ .classList.add('active') → Adds the "active" class to this image, making it visible.
// //
// //     index = (index + 1) % images.length;
// //     //1️⃣ index + 1 → Moves to the next image.
// //     //modulus operator (%) :we go back to the first one without errors.
// //     //
// // }
//
// //function flipImages:automatically switches images,making one visible at a time.
// //
// //
//
// /* New Code */
// setInterval(flipImages, 3000);
//
// document.getElementById("signInForm").addEventListener("submit", function (event) {
//     event.preventDefault(); // Prevent form submission
//
//     let username = document.getElementById("username").value;
//     let password = document.getElementById("password").value;
//
//     if (username === "" || password === "") {
//         alert("Both fields are required!");
//     } else {
//         // Store login state in localStorage
//         localStorage.setItem("isLoggedIn", "true");
//         // window.location.href = "dashboard.html"; // Redirect to a new page after sign-in
//     }
// });
//
// // Check login status and display videos/GIFs if logged in
// document.addEventListener("DOMContentLoaded", function () {
//     if (localStorage.getItem("isLoggedIn") === "true") {
//     }
// });
//
// //         document.getElementById("content").innerHTML = `
// //             // Image Slider Logic
// // let images = document.querySelectorAll('.image-slider img');
// // let index = 0;
// // //document.querySelectorAll('.image-slider img') finds all <img> elements inside an element with the class .image-slider.
// // //querySelectorAll() returns a NodeList (which is similar to an array).
// //
// // //🔹 let index = 0; means:
// // //✔ Start at the first image (position 0).
// // //✔ Keep track of which image is currently being displayed.
// //
// //
// // function flipImages() {
// //     //function flipImages:automatically switches images,making one visible at a time.
// //     images.forEach(img => img.classList.remove('active'));
// //     //images.forEach(...) → Go through each image one by one.
// //     //removes the "active" class from each image, so when we move to another image previous one will not be visible.
// //     images[index].classList.add('active');
// //     //1️⃣ images[index] → Selects the current image from the list.
// //     //2️⃣ .classList.add('active') → Adds the "active" class to this image, making it visible.
// //
// //     index = (index + 1) % images.length;
// //     //1️⃣ index + 1 → Moves to the next image.
// //     //modulus operator (%) :we go back to the first one without errors.
// //     //
// // }
// //
// // //function flipImages:automatically switches images,making one visible at a time.
// // //
// // //
// //
// // /* New Code */
// // setInterval(flipImages, 3000);
// //
// // document.getElementById("signInForm").addEventListener("submit", function (event) {
// //     event.preventDefault(); // Prevent form submission
// //
// //     let username = document.getElementById("username").value;
// //     let password = document.getElementById("password").value;
// //
// //     if (username === "" || password === "") {
// //         alert("Both fields are required!");
// //     } else {
// //         // Store login state in localStorage
// //         localStorage.setItem("isLoggedIn", "true");
// //         window.location.href = "dashboard.html"; // Redirect to a new page after sign-in
// //     }
// // });
// //
// // // Check login status and display videos/GIFs if logged in
// // document.addEventListener("DOMContentLoaded", function () {
// //     if (localStorage.getItem("isLoggedIn") === "true") {
// //         document.getElementById("content").innerHTML = \`
// //             <h1>Welcome to Your Training</h1>
// //             <video controls width="600">
// //                 <source src="video.mp4" type="video/mp4">
// //                 Your browser does not support the video tag.
// //             </video>
// //             <img src="animation.gif" alt="Training GIF" width="400">
// //             <button id="logout">Logout</button>
// //         \`;
// //
// //         document.getElementById("logout").addEventListener("click", function () {
// //             localStorage.removeItem("isLoggedIn");
// //             window.location.href = "sign-in.html"; // Redirect to sign-in page
// //         });
// //     }
// //
// // });
// // <h1>Welcome to Your Training</h1>
// //             <video controls width="600">
// //                 <source src="video.mp4" type="video/mp4">
// //                 Your browser does not support the video tag.
// //             </video>
// //             <img src="animation.gif" alt="Training GIF" width="400">
// //             <button id="logout">Logout</button>
// //         `;
// //
// //         document.getElementById("logout").addEventListener("click", function () {
// //             localStorage.removeItem("isLoggedIn");
// //             window.location.href = "sign-in.html"; // Redirect to sign-in page
// //         });
// //     }
// //
// // });
