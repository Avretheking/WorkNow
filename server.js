const express = require('express');
const app = express();
const port = 3000;

app.use(express.json());

let services = [
    { id: '1', name: 'Plumbing', description: 'Fixing pipes and leaks', price: 50 },
    { id: '2', name: 'Electrical', description: 'Electrical repairs and installations', price: 70 },
    // Add more services as needed
];

let bookings = [];

app.get('/services', (req, res) => {
    res.json(services);
});

app.post('/book', (req, res) => {
    const booking = req.body;
    bookings.push(booking);
    res.status(201).json({ message: 'Booking successful' });
});

app.get('/bookings', (req, res) => {
    res.json(bookings);
});

app.listen(port, () => {
    console.log(`Server listening at http://localhost:${port}`);
});