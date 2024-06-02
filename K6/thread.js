import http from 'k6/http';
import { sleep } from 'k6';

export default function () {
    http.get('http://localhost:8080/fhello4?name=gg&G=ff');
}

export const options = {
    vus: 10,
    duration: '30s',
};