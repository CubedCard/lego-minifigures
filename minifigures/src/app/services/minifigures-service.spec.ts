import { TestBed } from '@angular/core/testing';

import { MinifiguresService } from './minifigures-service';

describe('MinifiguresServiceService', () => {
  let service: MinifiguresService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MinifiguresService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
