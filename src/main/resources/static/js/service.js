const API_PORTFOLIO_URL = 'http://127.0.0.1:8080/api/portfolios/6'
const API_TWITTER_URL = 'http://127.0.0.1:8080/api/twitter'


fetch(API_PORTFOLIO_URL)
	.then(response => response.json())
	.then(data => mostrarData(data))
	.catch(err => console.log(err))

const mostrarData = (data) => {
	let name = document.getElementById('name');
	name.innerHTML = data.name;
	let experience = document.getElementById('experience');
	experience.innerHTML = data.experience;
	let photo = document.getElementById('photo');
	photo.src = data.imagePath;
}

fetch(API_TWITTER_URL)
	.then(response => response.json())
	.then(data => mostrarTweets(data))
	.catch(err => console.log(err))

const mostrarTweets = (data) => {
	let body = ''
	for (let i = 0; i < data.length; i++) {
		body += `<div class="card-header">`
		body += `<img class="card-img-top" src='${data[i].user.miniProfileImageURL}'>`
		body += `<strong class="card-title">${data[i].user.name}</strong>`
		body += `</div>`
		body += `<div class="card-body">`
		body += `<p class="card-text">${data[i].text}</p>`
		body += `</div>`
	}
	document.getElementById('twitterInfo').innerHTML = body

	console.log(data);
}